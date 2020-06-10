import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@ Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent implements OnInit {

  constructor(private route: Router) { }

  isLoggedIn() {
    let details = JSON.parse(localStorage.getItem('user'));

    if (details){
      console.log("true");
      return true;
      } else {
        console.log("false");
        return false ;
      }
    }
  isLoggedout() {
    localStorage.removeItem('user');
    this.route.navigateByUrl('/home');
  }
  ngOnInit() {
  }

}
