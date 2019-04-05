import { Component, OnInit } from '@angular/core';
import {  ElementRef, ViewChild } from '@angular/core';
import {FormBuilder, FormControl, FormGroup, NgForm, Validators} from '@angular/forms';
import {ActionsSubject, select, Store} from "@ngrx/store";
import {selectUserList} from "../store/selectors/user.selectors";
import {Router} from "@angular/router";
import {GetUsers} from "../store/action/admin.actions";
import {UserService} from "../service/user.service";



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
  role='';
   user={
    firstname :'mohammed',
    lastname : 'rabii',
    username : 'rabii20',
    phone : '0o6454545',
    role : 'admin',
    email : 'jj@jjj.com'
  }
  submit = false ;


   users=this.store.pipe(select(selectUserList));
  // users=null



  constructor(private _userService: UserService,private fb: FormBuilder,private store: Store<any>, private _router: Router,private actionsSubject: ActionsSubject) {}
  ngOnInit() {
     this.store.dispatch(new GetUsers());
    this.store.pipe(select(selectUserList)).subscribe((res)=>{
      console.log(res);
    });
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

  //hadi lakan chi input 3amar katkhalih
  //this.signupForm.form.patchValue({..});
  //onSubmit(form :NgForm){
  // console.log(form)
  //}
  validateForm: FormGroup;

  submitForm(): void {
    for (const i in this.validateForm.controls) {
      this.validateForm.controls[i].markAsDirty();
      this.validateForm.controls[i].updateValueAndValidity();
    }
  }

  updateConfirmValidator(): void {
    /** wait for refresh value */
    Promise.resolve().then(() => this.validateForm.controls.checkPassword.updateValueAndValidity());
  }

  confirmationValidator = (control: FormControl): { [s: string]: boolean } => {
    if (!control.value) {
      return { required: true };
    } else if (control.value !== this.validateForm.controls.password.value) {
      return { confirm: true, error: true };
    }
    return {};
  };

  getCaptcha(e: MouseEvent): void {
    e.preventDefault();
  }



  onSubmit(){
    this.submit=true;
    this.user.firstname=this.signupForm.value.Firstname;
    this.user.lastname=this.signupForm.value.Lastname;
    this.user.username=this.signupForm.value.username;
    this.user.email=this.signupForm.value.email;
    this.user.role=this.signupForm.value.role;
    this.user.phone=this.signupForm.value.phone;
    console.log(this.user)
    // this.users.push(this.user);
  }
}
