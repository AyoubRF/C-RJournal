import {ICategoryState, initialCategoryState} from "../state/category.state";
import {CategoryActions, CategoryActionTypes} from "../action/category.actions";

export function categoryReducer(state = initialCategoryState, action: CategoryActions): ICategoryState {
  switch (action.type) {
    case CategoryActionTypes.GetCategoriesSuccess: {
      return{
        ...state,
        categories: action.payload
      };
    }
    case CategoryActionTypes.AddCategorySuccess:{
      return{
        ...state,
        selectedCategory:action.payload,
        categories : [...state.categories,action.payload]
      }
    }
    default:
      return state;
  }
}
