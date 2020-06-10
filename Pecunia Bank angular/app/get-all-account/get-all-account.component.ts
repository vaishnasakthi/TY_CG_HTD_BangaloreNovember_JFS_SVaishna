import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { PecuniaService } from '../pecunia.service';

@ Component({
  selector: 'app-get-all-account',
  templateUrl: './get-all-account.component.html',
  styleUrls: ['./get-all-account.component.css']
})
export class GetAllAccountComponent implements OnInit {
  message: string;
  accounts: Account[];
  constructor(private pecuniaService: PecuniaService ,
    private route: Router) {
      this.getAllAccounts();
    }
    getAllAccounts() {
      this.pecuniaService.getAllAccount().subscribe(response => {
        console.log(response);
        // this.message = response.description;
        setTimeout(() => {
          this.message = null;
        }, 2000);
        this.accounts = response.bean;
      }, err => {
        console.log(err);
      });

    }
    selectAccount(account) {
      console.log(account);
      // this.customerService.selectedCustomerToUpdate = customer;
      this.route.navigate([`/updateacc/${account.accountId}`],
        {
          queryParams: {
            city: account.city,
            country: account.country,
            customerAadhar: account.customerAadhar,
            customerAddress: account.customerAddress,
            customerContactNo: account.customerContactNo,
            customerDOB: account.customerDOB,
            customerGender: account.customerGender,
            customerName: account.customerName,
            customerPAN: account.customerPAN,
            state: account.state,
            zipCode: account.zipCode
          }
        }
      );
    }
    deleteAccounts(account: Account){
      this.pecuniaService.deleteAccount(account).subscribe(response => {
        console.log(response);
      this.message = response.description;
      setTimeout(() => {
          this.message = null;
        }, 2000);
        if (response.statusCode === 201) {
          this.accounts.splice(this.accounts.indexOf(account), 1);
          setTimeout(() => {
            this.message = null;
          }, 1000);
        }
       });
     }

    deletemessage() {
      setTimeout(() => {
        this.message = null;
      }, 2000);
    }

  ngOnInit() {
  }

}
