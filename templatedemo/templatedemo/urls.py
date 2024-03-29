"""
URL configuration for templatedemo project.

The `urlpatterns` list routes URLs to views. For more information please see:
    https://docs.djangoproject.com/en/5.0/topics/http/urls/
Examples:
Function views
    1. Add an import:  from my_app import views
    2. Add a URL to urlpatterns:  path('', views.home, name='home')
Class-based views
    1. Add an import:  from other_app.views import Home
    2. Add a URL to urlpatterns:  path('', Home.as_view(), name='home')
Including another URLconf
    1. Import the include() function: from django.urls import include, path
    2. Add a URL to urlpatterns:  path('blog/', include('blog.urls'))
"""
from django.contrib import admin
from django.urls import include, path
from demoapp import views

urlpatterns = [
    path('admin/', admin.site.urls),
    path('dashboard/', views.display,name='home'),
    path('product/',views.product,name='product'),
    path('customer/<str:pk_test>/',views.customer,name='customer'),
    path('main/',views.main),
    path('create_order/<str:pk>/',views.createOrder,name='create_order'),
    path('update_order/<str:pk>/',views.updateOrder,name='updateorder'),
    path('delete_order/<str:pk>/',views.deleteOrder,name='deleteorder'),
    path('login/',views.loginPage,name='login'),
    path('register/',views.registerPage,name='register')
]
