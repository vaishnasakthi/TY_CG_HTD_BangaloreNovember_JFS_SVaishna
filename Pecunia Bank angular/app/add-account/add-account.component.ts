import { Component, OnInit } from '@angular/core';
import { PecuniaService } from '../pecunia.service';
import { Router } from '@angular/router';
import { NgForm } from '@angular/forms';

@ Component({
  selector: 'app-add-account',
  templateUrl: './add-account.component.html',
  styleUrls: ['./add-account.component.css']
})
export class AddAccountComponent implements OnInit {
  message: string;
  error: string;
  constructor(private pecuniaService: PecuniaService,
  private route: Router) { }
addAccount(form: NgForm){
  this.pecuniaService.addAccount(form.value).subscribe(data =>{
    console.log(data);
    console.log(form.value);
    if (data.statusCode === 404){
      this.error= data.description;
      setTimeout(() => {
        this.error = null;
      }, 10000);
    }
    if (data.statusCode === 200){
      this.message = data.description;
      setTimeout(() => {
        this.message = null;
       }, 10000);
      form.reset();
      localStorage.setItem('useraccountDetails', JSON.stringify(data));
      // console.log('user details stored in local storage');
     // this.route.navigateByUrl('/');
    }

  }, err => {
    console.log(err);
  })

}
  ngOnInit() {
  }

}
