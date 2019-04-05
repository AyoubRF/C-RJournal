import { Component, OnInit } from '@angular/core';
import { ArticleService } from "../article.service";
import { Article } from "../article";

@Component({
  selector: 'app-article-list',
  templateUrl: './article-list.component.html',
  styleUrls: ['./article-list.component.css']
})
export class ArticleListComponent implements OnInit {
  articles: Article[] = [];
  display: boolean = false;

  constructor(private articleService: ArticleService) { }
  ngOnInit() {
    this.articleService.getArticles().subscribe((articles: Article[])=>{
      this.articles = articles;
      console.log(articles);
    })
  }

  showDialog() {
    this.display = true;
  }
  hideDialog() {
    this.display = false;
  }

  onClick() {
    console.log('MSG', 'User Will be added ...');
  }

}
