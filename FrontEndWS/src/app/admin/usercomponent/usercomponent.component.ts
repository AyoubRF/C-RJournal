import { Component, OnInit } from '@angular/core';


@Component({
  selector: 'app-usercomponent',
  templateUrl: './usercomponent.component.html',
  styleUrls: ['./usercomponent.component.css']
})

export class UsercomponentComponent implements OnInit {

  cars=[{ firstname : "mohammed", lastname:"rabii",username:"rabii20",phoneNumber:"0645787478",role:"admin", email: "xx@hotmail.com"},{ firstname : "mohammed", lastname:"rabii",username:"rabii20",phoneNumber:"0645787478",role:"admin", email: "xx@hotmail.com"}];

  constructor() { }

  ngOnInit() {
  }

  onClick() {
    console.log('MSG', 'rah drna chi 7aja');
  }
}
