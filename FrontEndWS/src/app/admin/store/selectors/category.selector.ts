import { createSelector } from '@ngrx/store';
import { IAppState } from '../state/app.state';
import { IUserState } from '../state/user.state';
import {ICategoryState} from "../state/category.state";


const selectCategories = (state: IAppState) => state.categories;


export const selectCategoryList = createSelector(

  (state: IAppState) => state.categories,

  (state:  ICategoryState) => state.categories
);


export const selectSelectedCategory = createSelector(

  (state: IAppState) => state.categories,

  (state:  ICategoryState) => state.selectedCategory
);
