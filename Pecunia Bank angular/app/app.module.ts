import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {RouterModule} from '@angular/router';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule } from '@angular/forms';


import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { LoginComponent } from './login/login.component';
import { GetAllAccountComponent } from './get-all-account/get-all-account.component';
import { AddAccountComponent } from './add-account/add-account.component';
import { FilterAccountPipe } from './filter-account.pipe';
import { UpdateAccountComponent } from './update-account/update-account.component';
import { HomepageComponent } from './homepage/homepage.component';
import { HomeaccountComponent } from './homeaccount/homeaccount.component';
import { FooterComponent } from './footer/footer.component';
import { BgComponent } from './bg/bg.component';
import { PagenotfoundComponent } from './pagenotfound/pagenotfound.component';



@ NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    LoginComponent,
    GetAllAccountComponent,
    AddAccountComponent,
    FilterAccountPipe,
    UpdateAccountComponent,
    HomepageComponent,
    HomeaccountComponent,
    FooterComponent,
    BgComponent,
    PagenotfoundComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    FormsModule,
    RouterModule.forRoot([
      {path: '', redirectTo: 'home', pathMatch:'full'},
      {path: 'header', component: HeaderComponent},
      {path: 'addaccount', component: AddAccountComponent},
      {path: 'home', component: HomepageComponent},
      {path: 'homeaccount', component: HomeaccountComponent},
      {path: 'login', component: LoginComponent},
      {path: 'getaccount', component: GetAllAccountComponent},
      {path: 'updateacc/:accountId', component: UpdateAccountComponent},
      {path: '**', component: PagenotfoundComponent}
    ])
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
