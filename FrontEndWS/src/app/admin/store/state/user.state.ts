import { IUser } from 'src/app/admin/model/user.interface';


export interface IUserState {
  users: IUser[];
  selectedUser: IUser;
}

export const intialUserState: IUserState = {
  users: null,
  selectedUser: null
};
