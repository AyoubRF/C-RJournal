import { Action } from '@ngrx/store';
import {ICategory} from "../../model/category.interface";

export enum CategoryActionTypes {
  LoadActionCategories = '[ActionCategory] Load ActionCategories',
  GetCategories = '[category] Get categories',
  GetCategoriesSuccess = '[category] Get categories Success',
  AddCategory ='[category] Add category',
  AddCategorySuccess='[category] Add category Success'


}

export class LoadActionCategories implements Action {
  readonly type = CategoryActionTypes.LoadActionCategories;
}

export class GetCategories implements Action {
  public readonly type = CategoryActionTypes.GetCategories;
}

export class GetCategoriesSuccess implements Action {
  public readonly type = CategoryActionTypes.GetCategoriesSuccess;
  constructor(public payload: ICategory[]) {}
}

export class AddCategory implements  Action{
  public readonly type=CategoryActionTypes.AddCategory;
  constructor(public payload: ICategory) {}
}

export class AddCategorySuccess implements Action{
  public readonly type=CategoryActionTypes.AddCategorySuccess;
  constructor(public  payload:ICategory){}
}



export type CategoryActions = LoadActionCategories |GetCategories |AddCategory |AddCategorySuccess |GetCategoriesSuccess ;
