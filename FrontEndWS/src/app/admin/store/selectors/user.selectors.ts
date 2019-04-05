import { createSelector } from '@ngrx/store';
import { IAppState } from '../state/app.state';
import { IUserState } from '../state/user.state';


const selectUsers = (state: IAppState) => state.users;


export const selectUserList = createSelector(

  (state: IAppState) => state.users,

  (state:  IUserState) => state.users
);


export const selectSelectedUser = createSelector(

  (state: IAppState) => state.users,

  (state:  IUserState) => state.selectedUser
);
