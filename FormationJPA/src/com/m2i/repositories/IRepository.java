package com.m2i.repositories;

import java.util.List;

import com.m2i.entities.jpa.IEntity;

public interface IRepository<T extends IEntity> extends IUoW {

	public abstract T save(T entity);

	public abstract T update(T entity);

	public abstract void remove(T entity);

	public abstract T getById(int id);

	public abstract List<T> getAll();

}
