import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-right-menu',
  templateUrl: './right-menu.component.html',
  styleUrls: ['./right-menu.component.css']
})
export class RightMenuComponent implements OnInit {

  constructor() { }
  isCollapsed = false;
  collapse($event){
    $event.stopPropagation();
    $event.preventDefault();
    this.isCollapsed = !this.isCollapsed
  }

  ngOnInit() {
  }

}
