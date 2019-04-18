import { Component, OnInit } from '@angular/core';
import {  ElementRef, ViewChild } from '@angular/core';
import {FormBuilder, FormControl, FormGroup, NgForm, Validators} from '@angular/forms';
import {ActionsSubject, select, Store} from "@ngrx/store";
import {selectUserList} from "../store/selectors/user.selectors";
import {Router} from "@angular/router";
import {AddUser, GetUsers} from "../store/action/admin.actions";
import {UserService} from "../service/user.service";



@Component({
  selector: 'app-usercomponent',
  templateUrl: './usercomponent.component.html',
  styleUrls: ['./usercomponent.component.css']
})

export class UsercomponentComponent implements OnInit {

  isVisible = false;
  isConfirmLoading = false;
  submit = false ;

  user={
    idUser : null,
    firstname :'',
    lastname : '',
    username : '',
    phoneNumber : '',
    email : '',
    role : ''
  }

  validateForm: FormGroup;
  @ViewChild('f') signupForm : NgForm ;

  users=this.store.pipe(select(selectUserList));

  constructor(private _userService: UserService,
              private fb: FormBuilder,private store: Store<any>, private _router: Router,
              private actionsSubject: ActionsSubject
              ) {}

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
    }, 2000);
  }

  handleCancel(): void {
    this.isVisible = false;
  }


  onSubmit(){
    this.submit=true;
    this.user.firstname=this.signupForm.value.Firstname;
    this.user.lastname=this.signupForm.value.Lastname;
    this.user.username=this.signupForm.value.username;
    this.user.email=this.signupForm.value.email;
    this.user.phoneNumber=this.signupForm.value.phone;
    this.user.role=this.signupForm.value.role;
    this.store.dispatch(new AddUser(this.user));
    console.log(this.user)
  }


  /* =================== NON USED ======================*/

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

  /* ======================================================= */

}
