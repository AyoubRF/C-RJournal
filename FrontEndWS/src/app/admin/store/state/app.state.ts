import { IUserState, intialUserState} from './user.state';
import{ RouterReducerState } from '@ngrx/router-store'
import {ICategoryState, initialCategoryState} from "./category.state";


export interface IAppState{
  router?: RouterReducerState;
  users: IUserState,
  categories : ICategoryState
}

export const initialAppState: IAppState = {
  users: intialUserState,
  categories : initialCategoryState
}

export function getInitialState(): IAppState {
  return initialAppState;
}
