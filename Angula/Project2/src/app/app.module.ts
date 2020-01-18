import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {RouterModule} from '@angular/router';
import {HttpClientModule} from '@angular/common/http';

import { AppComponent } from './app.component';
import { HomeComponent } from './home/home.component';
import { HeaderComponent } from './header/header.component';
import { PostsComponent } from './posts/posts.component';
import { AddPostsComponent } from './add-posts/add-posts.component';


@ NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    AddPostsComponent,
    HeaderComponent,
    PostsComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    RouterModule.forRoot(
      [
        {path: '', component: HeaderComponent},
        {path: 'home', component: HomeComponent},
        {path: 'addposts', component: AddPostsComponent},
        {path: 'posts', component: PostsComponent},

      ])

  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
