import {Injectable} from "@angular/core";
import {environment} from "../../../environments/environment";
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {Icategories} from "../model/http-models/categories.interface";

@Injectable({
  providedIn: 'root'
})
export class CategoryService {

  Url = `${environment.apiUrl}`;

  constructor(private _http : HttpClient) { }


  getCategories(): Observable<Icategories> {
    return this._http.get<any>(this.Url+`/api/categories/`);
  }
  createCategory(category: object): Observable<object> {
    console.log('attack backend from Category')
    return this._http.post(this.Url + `/api/categories/`, category);
  }



}
