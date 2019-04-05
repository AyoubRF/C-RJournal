import { Injectable } from '@angular/core';
// import { InMemoryDbService } from 'angular-in-memory-web-api';


@Injectable({
  providedIn: 'root'
})
export class DataService {

  constructor() { }

  createDb(){
    let  articles =  [
      {  id:  1,  name:  'Article 1' },
      {  id:  2,  name:  'Article 2' },
      {  id:  3,  name:  'Article 3' },
      {  id:  4,  name:  'Article 4' },
      {  id:  5,  name:  'Article 5' }
    ];

    return { articles };
  }


}
