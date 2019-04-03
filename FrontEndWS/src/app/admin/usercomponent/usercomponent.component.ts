import { Component, OnInit } from '@angular/core';
import {  ElementRef, ViewChild } from '@angular/core';
import { NgForm } from '@angular/forms';


@Component({
  selector: 'app-usercomponent',
  templateUrl: './usercomponent.component.html',
  styleUrls: ['./usercomponent.component.css']
})

export class UsercomponentComponent implements OnInit {
  isVisible = false;
  isConfirmLoading = false;
  @ViewChild('f') signupForm : NgForm ;
  defaultQuestion = 'pet';

  answer = '';
  Firstname='';
  Lastname='';
  username='';
  email='';
  phone='';

  genders = ['male','female'];
  user = {
    username : '',
    email : '',
    secretQuestions : '',
    gender : '',
    answer : ''
  };
  submit = false ;

  users=[{ firstname : "mohammed", lastname:"rabii",username:"rabii20",phoneNumber:"0645787478",role:"admin", email: "xx@hotmail.com"},
    { firstname : "ayoub", lastname:"raffass",username:"ayoub96",phoneNumber:"0645787478",role:"admin", email: "yy@gmail.com"}];

  constructor() { }

  ngOnInit() {
  }
  showModal(): void {
    this.isVisible = true;
  }
  handleOk(): void {
    this.isConfirmLoading = true;
    setTimeout(() => {
      this.isVisible = false;
      this.isConfirmLoading = false;
    }, 3000);
  }
  handleCancel(): void {
    this.isVisible = false;
  }
  onClick() {
    console.log('MSG', 'User Will be added ...');
  }

  suggestUserName() {
    const suggestedName = 'Superuser';
    //hadi katem7i les champs diyal tt les inputs
    this.signupForm.setValue({
      userData: {
        username:suggestedName,
        email:''
      },
      secret: 'pet',
      questionAnswer: '',
      gender:'male'

    });
  }
  //hadi lakan chi input 3amar katkhalih
  //this.signupForm.form.patchValue({..});
  //onSubmit(form :NgForm){
  // console.log(form)
  //}
  onSubmit(){
    this.submit=true;
    this.user.username=this.signupForm.value.userData.username;
    this.user.email=this.signupForm.value.userData.email;
    this.user.secretQuestions=this.signupForm.value.secret;
    this.user.answer=this.signupForm.value.questionAnswer;
    this.user.gender=this.signupForm.value.gender;

  }
}
