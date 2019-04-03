import { Component, OnInit } from '@angular/core';
import { User } from 'src/app/models/user';
import { NgForm } from '@angular/forms';


@Component({
  selector: 'app-usercomponent',
  templateUrl: './usercomponent.component.html',
  styleUrls: ['./usercomponent.component.css']
})

export class UsercomponentComponent implements OnInit {

  users : User[]=[{ firstname : "mohammed", lastname:"rabii",username:"rabii20",phoneNumber:"0645787478",role:["admin"], email: "xx@hotmail.com"},
    { firstname : "ayoub", lastname:"raffass",username:"ayoub96",phoneNumber:"0645787478",role: ["admin"], email: "yy@gmail.com"},
    { firstname : "zakaria", lastname:"tourabi",username:"mrnobody",phoneNumber:"0628960201",role:["admin"], email: "zz@gmail.com"}];

    display : boolean
  constructor() { }

  ngOnInit() {
  }

  onClick() {
    console.log('adding user ... // we must add some decorate instead the log')
    this.display = true;
  }
  hideDialog(){
    this.display=false;
  }
  addUser(form : NgForm){
    /**
     * code to replace when caling the backend
     */
  //   this.authService.login(credentials)
  //   .subscribe(result => { 
  //      if (result){
  //      this.router.navigate(['/listShops'])
  //      }
  //    }, 
  //    (err) => {
  //       this.invalidLogin = true;
  //    }
  // );
    this.users.push(form.value);
    this.display=false;
    form.reset();
  }
}
  

