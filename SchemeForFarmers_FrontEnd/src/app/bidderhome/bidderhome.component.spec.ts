import { ComponentFixture, TestBed } from '@angular/core/testing';

import { BidderhomeComponent } from './bidderhome.component';

describe('BidderhomeComponent', () => {
  let component: BidderhomeComponent;
  let fixture: ComponentFixture<BidderhomeComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ BidderhomeComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(BidderhomeComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
