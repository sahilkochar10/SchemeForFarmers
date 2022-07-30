import { ComponentFixture, TestBed } from '@angular/core/testing';

import { BidPlacingComponent } from './bid-placing.component';

describe('BidPlacingComponent', () => {
  let component: BidPlacingComponent;
  let fixture: ComponentFixture<BidPlacingComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ BidPlacingComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(BidPlacingComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
