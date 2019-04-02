import { Injectable } from '@angular/core';
import { HttpClient } from "@angular/common/http";

@Injectable({
  providedIn: 'root'
})
export class ArticleService {
  API_URL: string = "api/";

  constructor(private httpClient: HttpClient) { }

  getArticles() {
    return this.httpClient.get(this.API_URL + 'articles')
  }

  getArticle(articleId) {
    return this.httpClient.get(`${this.API_URL + 'articles'}/${articleId}`)
  }
}
