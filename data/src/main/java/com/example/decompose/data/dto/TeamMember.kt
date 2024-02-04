package com.example.decompose.data.dto

import com.example.decompose.domain.model.TeamMember

data class TeamMember(
    val id: String,
    val name: String,
    val position: String
) {
    fun toTeamMemberDomain() : TeamMember {
        return TeamMember(
            id, name, position
        )
    }
}
