import { Injectable } from '@angular/core';
import {Actions, Effect, ofType} from '@ngrx/effects';
import {  select } from '@ngrx/store';
import { of } from 'rxjs';
import {UserService} from "../../service/user.service";
import {Store} from "@ngrx/store";
import {IAppState} from "../state/app.state";
import {map, switchMap} from "rxjs/operators";
import {ActionAdminActionTypes, AddUser, AddUserSuccess, GetUsers, GetUsersSuccess} from "../action/admin.actions";



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

  constructor(private _actions$: Actions
    ,private _userService: UserService,
              private _store: Store<IAppState>) {}

}
