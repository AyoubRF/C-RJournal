import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ArticlecomponentComponent } from './articlecomponent.component';

describe('ArticlecomponentComponent', () => {
  let component: ArticlecomponentComponent;
  let fixture: ComponentFixture<ArticlecomponentComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ArticlecomponentComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ArticlecomponentComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
