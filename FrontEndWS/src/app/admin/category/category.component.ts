import {Component, OnInit, ViewChild} from '@angular/core';
import {ActionsSubject, select, Store} from "@ngrx/store";
import {Router} from "@angular/router";
import {selectCategoryList} from "../store/selectors/category.selector";
import {CategoryService} from "../service/category.service";
import {GetCategories} from "../store/action/category.actions";

@Component({
  selector: 'app-category',
  templateUrl: './category.component.html',
  styleUrls: ['./category.component.css']
})
export class CategoryComponent implements OnInit {


  submitted = false;
  isVisible = false;
  isConfirmLoading = false;

  category={
    idCategory : null,
    name : '',
    description : ''
  }

  categories = this.store.pipe(select(selectCategoryList));

  constructor(private _categoryService: CategoryService,
              private store: Store<any>, private _router: Router,
              private actionsSubject: ActionsSubject
              ) {}

  ngOnInit() {
    this.store.dispatch(new GetCategories());
    this.store.pipe(select(selectCategoryList)).subscribe((res)=>{
      console.log(res);
    });
  }

  showModal(): void {
    this.isVisible = true;
  }

  handleOk(): void {
    this.isConfirmLoading = true;
    setTimeout(() => {
      this.isVisible = false;
      this.isConfirmLoading = false;
      this.submitted = false;
    }, 2000);
  }

  handleCancel(): void {
    this.isVisible = false;
    this.submitted = false;
  }

}
