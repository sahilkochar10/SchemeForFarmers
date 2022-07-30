import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SoldHistoryComponent } from './sold-history.component';

describe('SoldHistoryComponent', () => {
  let component: SoldHistoryComponent;
  let fixture: ComponentFixture<SoldHistoryComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ SoldHistoryComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(SoldHistoryComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
