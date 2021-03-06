import {ICategory} from "../../model/category.interface";

export interface ICategoryState {
  categories: ICategory[];
  selectedCategory: ICategory;
}

export const initialCategoryState: ICategoryState = {
  categories: null,
  selectedCategory: null
};
