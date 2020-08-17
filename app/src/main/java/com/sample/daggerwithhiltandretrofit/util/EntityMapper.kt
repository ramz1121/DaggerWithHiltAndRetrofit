package com.sample.daggerwithhiltandretrofit.util

interface EntityMapper<Entity, DomainModel> {

    fun mapFromEntity(entity: Entity):DomainModel

    fun mapToEntity(domainModel: DomainModel): Entity
}