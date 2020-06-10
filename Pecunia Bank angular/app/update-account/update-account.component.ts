import { Component, OnInit } from '@angular/core';
import { PecuniaService } from '../pecunia.service';
import { Router, ActivatedRoute } from '@angular/router';
import { NgForm } from '@angular/forms';

@ Component({
  selector: 'app-update-account',
  templateUrl: './update-account.component.html',
  styleUrls: ['./update-account.component.css']
})
export class UpdateAccountComponent implements OnInit {
  error: string;
  message: string;
  accountId1;
  city1;
  country1;
  customerAadhar1;
  customerAddress1;
  customerContactNo1;
  customerDOB1;
  customerGender1;
  customerName1;
  customerPAN1;
  state1;
  zipCode1;
  constructor(private pecuniaService: PecuniaService ,
    private route: Router, private activatedRoute: ActivatedRoute) {
      activatedRoute.params.subscribe(data => {
        console.log(data);
        this.accountId1 = data.accountId;
      });
      activatedRoute.queryParams.subscribe(data => {
        console.log(data);
        this.city1 = data.city;
        this.country1 = data.country;
        this.customerAadhar1 = data.customerAadhar;
        this.customerAddress1 = data.customerAddress;
        this.customerContactNo1 = data.customerContactNo;
        this.customerDOB1 = data.customerDOB;
        this.customerGender1 = data.customerGender;
        this.customerName1 = data.customerName;
        this.customerPAN1 = data.customerPAN;
        this.state1 = data.state;
        this.zipCode1 = data.zipCode;

      });
     }

  ngOnInit() {
  }
  updateAccountDetails(form: NgForm) {
    this.pecuniaService.updateAccount(form.value).subscribe(res => {
      console.log(res);
      if (res.statusCode === 200) {
        this.message = res.description;
        setTimeout(() => {
          this.message = null;
          this.route.navigateByUrl('getaccount');
        }, 2000);
        form.reset();
      } else {
        this.error = res.description;
        setTimeout(() => {
          this.error = null;
        }, 2000);
      }
    }, error => {
      console.log(error);
    });
  }

}
