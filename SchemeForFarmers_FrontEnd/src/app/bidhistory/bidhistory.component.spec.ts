import { ComponentFixture, TestBed } from '@angular/core/testing';

import { BidhistoryComponent } from './bidhistory.component';

describe('BidhistoryComponent', () => {
  let component: BidhistoryComponent;
  let fixture: ComponentFixture<BidhistoryComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ BidhistoryComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(BidhistoryComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
