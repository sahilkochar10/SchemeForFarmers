import { ComponentFixture, TestBed } from '@angular/core/testing';

import { InsuranceApprovalComponent } from './insurance-approval.component';

describe('InsuranceApprovalComponent', () => {
  let component: InsuranceApprovalComponent;
  let fixture: ComponentFixture<InsuranceApprovalComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ InsuranceApprovalComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(InsuranceApprovalComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
