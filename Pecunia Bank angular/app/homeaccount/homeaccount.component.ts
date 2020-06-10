import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@ Component({
  selector: 'app-homeaccount',
  templateUrl: './homeaccount.component.html',
  styleUrls: ['./homeaccount.component.css']
})
export class HomeaccountComponent implements OnInit {

  constructor(private route: Router) { }
  isLoggedIn() {
    let details = JSON.parse(localStorage.getItem('bean'));

    if (details){
      console.log("true");
      return true;
      } else {
        console.log("false");
        return false ;
      }
    }
  isLoggedout() {
    localStorage.removeItem('bean');
    this.route.navigateByUrl('/home');
  }
  ngOnInit() {
  }

}
