import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {RouterModule} from '@angular/router'
import {FormsModule} from '@angular/forms'


import { AppComponent } from './app.component';
import { HomeComponent } from './home/home.component';
import { CustomerComponent } from './customer/customer.component';
import { PrductsComponent } from './prducts/prducts.component';
import { LoginComponent } from './login/login.component';
import { HeaderComponent } from './header/header.component';
import { PagenotfoundComponent } from './pagenotfound/pagenotfound.component';

@ NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    CustomerComponent,
    PrductsComponent,
    LoginComponent,
    HeaderComponent,
    PagenotfoundComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    RouterModule.forRoot(
      [
        {path: '', component: HeaderComponent},
        {path: 'home', component: HomeComponent},
        {path: 'login', component: LoginComponent},
        {path: 'customer', component: CustomerComponent},
        {path: 'products', component: PrductsComponent},
        {path: '**', component: PagenotfoundComponent},
      ])

  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
