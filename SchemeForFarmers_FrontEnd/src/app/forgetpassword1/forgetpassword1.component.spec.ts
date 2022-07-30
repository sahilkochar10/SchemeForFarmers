import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Forgetpassword1Component } from './forgetpassword1.component';

describe('Forgetpassword1Component', () => {
  let component: Forgetpassword1Component;
  let fixture: ComponentFixture<Forgetpassword1Component>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ Forgetpassword1Component ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(Forgetpassword1Component);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
