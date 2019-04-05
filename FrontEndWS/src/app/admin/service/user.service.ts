import { Injectable } from '@angular/core';
import {environment} from "../../../environments/environment";
import {Observable} from "rxjs";
import { HttpClient } from '@angular/common/http';
import {IUsers} from "../model/http-models/users.interface";


@Injectable({
  providedIn: 'root'
})
export class UserService {

  Url = `${environment.apiUrl}`;

  constructor(private _http : HttpClient) { }

  getUsers(): Observable<IUsers> {
    return this._http.get<any>(this.Url+`/api/users/`);
  }



}
