import {intialUserState, IUserState} from '../state/user.state';
import {ActionAdminActions, ActionAdminActionTypes} from '../action/admin.actions'


export function reducer(state = intialUserState, action: ActionAdminActions): IUserState {
  switch (action.type) {
    case ActionAdminActionTypes.GetUsersSuccess: {
      return{
        ...state,
        users: action.payload
      };
    }
    case ActionAdminActionTypes.AddUserSuccess:{
      return{
        ...state,
        selectedUser:action.payload,
        users : [...state.users,action.payload]
      }
    }
    default:
      return state;
  }
}
