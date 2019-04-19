import { ActionReducerMap } from '@ngrx/store';
import { IAppState } from '../state/app.state';
import { routerReducer } from '@ngrx/router-store';
import { reducer} from './admin.reducer';
import {categoryReducer} from "./category.reducer";

export const appReducers: ActionReducerMap<IAppState, any> = {
  router: routerReducer,
  users: reducer,
  categories : categoryReducer
};
