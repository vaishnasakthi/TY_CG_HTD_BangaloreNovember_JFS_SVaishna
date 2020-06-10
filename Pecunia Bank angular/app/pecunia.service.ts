import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@ Injectable({
  providedIn: 'root'
})
export class PecuniaService {
  api = 'http://localhost:8081';
  constructor(private http:HttpClient) { }
  loginForm(login: Login): Observable< any> {
    return this.http.post< any>(`http://localhost:8081/login`, login);
  }

  getAllAccount(): Observable< any> {
    return this.http.get< any>(`http://localhost:8081/getAllAccount`);
  }

  deleteAccount(account: Account): Observable< any>{
    return this.http.delete< any>(`http://localhost:8081/deleteAccount/${account.accountId}`);

  }
  addAccount(account: Account): Observable< any> {
   return this.http.post< any>(`http://localhost:8081/addAccount`, account);

  }
  updateAccount(account: Account): Observable< any> {
    return this.http.put< any>(  `http://localhost:8081/modifyAccount`, account);

  }
}
