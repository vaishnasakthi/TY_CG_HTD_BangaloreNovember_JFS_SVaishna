import { Component, OnInit } from '@angular/core';
import { PecuniaService } from '../pecunia.service';
import { Router } from '@angular/router';
import { NgForm } from '@angular/forms';

@ Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  message: string;
  error: string;
  constructor(private pecuniaService: PecuniaService,
  private route: Router) { }
  login(form: NgForm){
    this.pecuniaService.loginForm(form.value).subscribe(response => {
      console.log(response);
      if (response.statusCode === 201) {
        localStorage.setItem('user', JSON.stringify(response));
        console.log('user details stored in local storage');
        this.route.navigateByUrl('/homeaccount');
        this.message = response.description;
        setTimeout(() => {
          this.message = null;
        }, 2000);
        form.reset();
      }
      if (response.statusCode ===401)
       {
        this.error = response.description;
        setTimeout(() => {
          this.error = null;
        }, 2000);
      }
    }, err => {
      console.log(err);
      this.error=err.description;
      setTimeout(() => {
        this.error=null;
      }
    )
    }
  );

  }

  ngOnInit() {
  }

}
