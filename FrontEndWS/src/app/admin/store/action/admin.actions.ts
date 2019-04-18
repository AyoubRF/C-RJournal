import { Action } from '@ngrx/store';
import {IUser} from "../../model/user.interface";

export enum ActionAdminActionTypes {
  LoadActionAdmins = '[ActionAdmin] Load ActionAdmins',
  GetUsers = '[user] Get users',
  GetUsersSuccess = '[user] Get users Success',
  AddUser ='[user] Add user',
  AddUserSuccess='[user] Add user Success'


}

export class LoadActionAdmins implements Action {
  readonly type = ActionAdminActionTypes.LoadActionAdmins;
}
export class GetUsers implements Action {
  public readonly type = ActionAdminActionTypes.GetUsers;
}
export class AddUser implements  Action{
  public readonly type=ActionAdminActionTypes.AddUser;
  constructor(public payload: IUser) {}
}
export class AddUserSuccess implements Action{
  public readonly type=ActionAdminActionTypes.AddUserSuccess;
  constructor(public  payload:IUser){}
}

export class GetUsersSuccess implements Action {
  public readonly type = ActionAdminActionTypes.GetUsersSuccess;
  constructor(public payload: IUser[]) {}
}

export type ActionAdminActions = LoadActionAdmins |GetUsers |GetUsersSuccess |AddUser |AddUserSuccess ;
