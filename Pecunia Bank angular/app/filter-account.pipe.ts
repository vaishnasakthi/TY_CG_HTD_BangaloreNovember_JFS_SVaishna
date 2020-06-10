import { Pipe, PipeTransform } from '@angular/core';

@ Pipe({
  name: 'filterAccount'
})
export class FilterAccountPipe implements PipeTransform {

  transform( account : Account[], search: string ): Account[] {
    if (search === undefined){
      return account;
    }
    return account.filter((account, index) => {
      return account.customerName.toLocaleLowerCase().includes(search.toLocaleLowerCase());

    });
  }

}

