import { Component, OnInit } from '@angular/core';
import {Article} from "../article";
import {ArticleService} from "../article.service";

@Component({
  selector: 'app-article-detail',
  templateUrl: './article-detail.component.html',
  styleUrls: ['./article-detail.component.css']
})
export class ArticleDetailComponent implements OnInit {
  article: Article = new Article(-1,'No Article');
  constructor(private articleService: ArticleService) { }
  ngOnInit() {
    this.articleService.getArticle(1).subscribe((article: Article) =>{
      this.article = article;
    })
  }
}
