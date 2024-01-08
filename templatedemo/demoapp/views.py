from django.shortcuts import render,redirect
from django.http import HttpResponse
import datetime
from .models import *
from django.contrib.auth.forms import UserCreationForm

from .forms import OrderForm,CreateUserForm
from django.forms import inlineformset_factory
from .filter import OrderFilter
# Create your views here.
from django.contrib import messages

def registerPage(request):
    form = CreateUserForm()
    
    if request.method == 'POST':
     form = CreateUserForm(request.POST)
     if form.is_valid():
         form.save()
         user = form.cleaned_data.get('username')
         messages.success(request, 'Account was created for' + user)
         return redirect('login')
         
    context = {'form':form}
    return render(request, 'demoapp/register.html',context)

def loginPage(request):
    context = {}
    return render(request,'demoapp/login.html',context)

def display(request):
    orders = Order.objects.all()
    customers = Customer.objects.all()
    total_customer = Customer.objects.count() 
    total_order = Order.objects.count() 
    delivered = orders.filter(status='Delivery').count()
    pending = orders.filter(status='pending').count()
    
    context = {'orders':orders,'customers':customers,'total_order':total_order,'total_customer':total_customer,
                'delivered':delivered,'pending':pending
               }
    return render(request, 'demoapp/dashboard.html' , context)

def product(request):
    products = Product.objects.all()
    product = {'products':products}
    return render(request,'demoapp/product.html', context=product)


def customer(request,pk_test):
    customer = Customer.objects.get(id=pk_test)
    orders = customer.order_set.all() 
    order_count = orders.count() 
    myFilter = OrderFilter(request.GET, queryset=orders)
    orders = myFilter.qs  
    context = {'customer':customer,'orders':orders,'order_count':order_count,
               'myFilter':myFilter} 
    return render(request,'demoapp/customer.html',context)

def main(request):
    return render(request,'demoapp/main.html')

def createOrder(request,pk):
    OrderFormSet = inlineformset_factory(Customer,Order, fields=('product','status'),extra=10)
    customer = Customer.objects.get(id = pk)
    formset = OrderFormSet(queryset=Order.objects.none(),instance=customer)
    #form = OrderForm(initial={'customer':customer})
    if request.method == 'POST':
           #print('Printing POST:',request.POST)
        #form = OrderForm(request.POST)
        formset = OrderFormSet(request.POST, instance=customer)
        if formset.is_valid():
            formset.save()
            return redirect('http://127.0.0.1:8000/dashboard/')
        
    context={'formset':formset}
    return render(request,'demoapp/admin_form.html',context)

def updateOrder(request,pk):
    
    order= Order.objects.get(id=pk)
    form = OrderForm(instance=order)
    
    if request.method == 'POST':
        
        form = OrderForm(request.POST,instance=order)
        if form.is_valid():
            form.save()
            return redirect('http://127.0.0.1:8000/dashboard/')
    context = {'form':form}
    return render(request,'demoapp/admin_form.html',context)

def deleteOrder(request,pk):
    order = Order.objects.get(id=pk)
    if request.method == "POST":
        order.delete()
        return redirect('http://127.0.0.1:8000/dashboard/')
    context = {'item':order}
    return render(request,'demoapp/delete.html',context)
