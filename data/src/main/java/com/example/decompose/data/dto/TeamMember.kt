package com.example.decompose.data.dto


data class TeamMember(
    val id: String,
    val name: String,
    val position: String
) {
    fun toTeamMemberDomain() : com.example.decompose.domain.model.TeamMember {
        return com.example.decompose.domain.model.TeamMember(
            id, name, position
        )
    }
}
