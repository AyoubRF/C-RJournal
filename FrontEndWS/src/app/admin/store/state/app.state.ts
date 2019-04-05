import { IUserState, intialUserState} from './user.state';
import{ RouterReducerState } from '@ngrx/router-store'


export interface IAppState{
  router?: RouterReducerState;
  users: IUserState
}

export const initialAppState: IAppState = {
  users: intialUserState
}

export function getInitialState(): IAppState {
  return initialAppState;
}
