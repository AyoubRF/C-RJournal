import { Component, OnInit } from '@angular/core';


@Component({
  selector: 'app-usercomponent',
  templateUrl: './usercomponent.component.html',
  styleUrls: ['./usercomponent.component.css']
})

export class UsercomponentComponent implements OnInit {

  users=[{ firstname : "mohammed", lastname:"rabii",username:"rabii20",phoneNumber:"0645787478",role:"admin", email: "xx@hotmail.com"},
    { firstname : "ayoub", lastname:"raffass",username:"ayoub96",phoneNumber:"0645787478",role:"admin", email: "yy@gmail.com"}];

  constructor() { }

  ngOnInit() {
  }

  onClick() {
    console.log('MSG', 'User Will be added ...');
  }
}
