import { Injectable } from '@angular/core';
import {Actions, Effect, ofType} from '@ngrx/effects';
import { of } from 'rxjs';
import {UserService} from "../../service/user.service";
import {Store} from "@ngrx/store";
import {IAppState} from "../state/app.state";
import {map, switchMap} from "rxjs/operators";
import {ActionAdminActionTypes, AddUser, AddUserSuccess, GetUsers, GetUsersSuccess} from "../action/admin.actions";
import {
  AddCategory,
  AddCategorySuccess,
  CategoryActionTypes,
  GetCategories,
  GetCategoriesSuccess
} from "../action/category.actions";
import {CategoryService} from "../../service/category.service";



@Injectable()
export class EffectAdminEffects {

  @Effect()
  getUsers$ = this._actions$.pipe(
    ofType<GetUsers>(ActionAdminActionTypes.GetUsers),
    switchMap(() => this._userService.getUsers()),
    switchMap((customerHttp: any) => of(new GetUsersSuccess(customerHttp)))
  );

  @Effect()
  addUser$ = this._actions$.pipe(
    ofType<AddUser>(ActionAdminActionTypes.AddUser),
    map((action: AddUser) => action.payload),
    switchMap((user)=>this._userService.createUser(user)),
    switchMap((userHttp : any)=> of(new AddUserSuccess(userHttp)))
  );

  @Effect()
  getCategories$ = this._actions$.pipe(
    ofType<GetCategories>(CategoryActionTypes.GetCategories),
    switchMap(() => this._categoryService.getCategories()),
    switchMap((customerHttp: any) => of(new GetCategoriesSuccess(customerHttp)))
  );

  @Effect()
  addCategory$ = this._actions$.pipe(
    ofType<AddCategory>(CategoryActionTypes.AddCategory),
    map((action: AddCategory) => action.payload),
    switchMap((category)=>this._categoryService.createCategory(category)),
    switchMap((userHttp : any)=> of(new AddCategorySuccess(userHttp)))
  );

  constructor(private _actions$: Actions
    ,private _userService: UserService,private _categoryService : CategoryService,
              private _store: Store<IAppState>) {}

}
