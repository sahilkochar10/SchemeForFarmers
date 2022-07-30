import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Resetpassword1Component } from './resetpassword1.component';

describe('Resetpassword1Component', () => {
  let component: Resetpassword1Component;
  let fixture: ComponentFixture<Resetpassword1Component>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ Resetpassword1Component ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(Resetpassword1Component);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
