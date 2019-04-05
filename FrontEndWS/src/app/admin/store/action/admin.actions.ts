import { Action } from '@ngrx/store';
import {IUser} from "../../model/user.interface";

export enum ActionAdminActionTypes {
  LoadActionAdmins = '[ActionAdmin] Load ActionAdmins',
  GetUsers = '[user] Get users',
  GetUsersSuccess = '[user] Get users Success'


}

export class LoadActionAdmins implements Action {
  readonly type = ActionAdminActionTypes.LoadActionAdmins;
}
export class GetUsers implements Action {
  public readonly type = ActionAdminActionTypes.GetUsers;
}

export class GetUsersSuccess implements Action {
  public readonly type = ActionAdminActionTypes.GetUsersSuccess;
  constructor(public payload: IUser[]) {}
}

export type ActionAdminActions = LoadActionAdmins |GetUsers |GetUsersSuccess ;
