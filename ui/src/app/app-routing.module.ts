import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AddBookComponent } from './add-book/add-book.component';
import { AppComponent } from './app.component';
import { BorrowBookComponent } from './borrow-book/borrow-book.component';
import { DeleteBookComponent } from './delete-book/delete-book.component';
import { DisplayListComponent } from './display-list/display-list.component';
import { ReturnBookComponent } from './return-book/return-book.component';
import { UserLoginComponent } from './user-login/user-login.component';

const routes: Routes = [
  {
    path:'',
    component: AddBookComponent
  },
  {
    path:'delete',
    component: DeleteBookComponent
  },
  {
    path:'borrow',
    component: BorrowBookComponent
  },
  {
    path:'return',
    component: ReturnBookComponent
  },
  {
    path:'display',
    component: DisplayListComponent
  },
  {
    path:'login',
    component: UserLoginComponent
  },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
