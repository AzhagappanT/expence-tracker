from django.shortcuts import render
from django.http import HttpResponse

def wish(request):
    message= '<h1>hi abi<h1>'
    return HttpResponse(message)
# Create your views here.
